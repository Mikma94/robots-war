DROP TABLE IF EXISTS GAME;
CREATE TABLE GAME(id LONG PRIMARY KEY AUTO_INCREMENT,
                  health_robot_1 INT,
                  health_robot_2 INT,
                  name_robot_1 VARCHAR(255),
                  name_robot_2 VARCHAR(255),
                  game_finished BOOLEAN,
                  date_and_time TIMESTAMP);