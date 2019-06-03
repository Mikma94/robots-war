const Bundler = require('parcel-bundler');
const express = require('express');
const proxy = require('http-proxy-middleware');

const app = express();

app.use('/api', proxy({ target: 'http://localhost:8088', changeOrigin: true }))

const bundler = new Bundler('src/index.html', {});
app.use(bundler.middleware());

app.listen(1234);