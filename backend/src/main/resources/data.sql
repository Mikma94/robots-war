DROP TABLE IF EXISTS GAME;
CREATE TABLE GAME(id LONG PRIMARY KEY AUTO_INCREMENT,
                  health_player_1 INT,
                  health_player_2 INT,
                  name_player_1 VARCHAR(255),
                  name_player_2 VARCHAR(255),
                  game_finished BOOLEAN,
                  date_and_time TIMESTAMP);