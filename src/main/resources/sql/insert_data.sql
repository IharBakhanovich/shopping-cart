INSERT INTO article (preis, amount) VALUES (10.99, 7);
INSERT INTO article (preis, amount) VALUES (11.99, 5);
INSERT INTO article (preis, amount) VALUES (12.99, 10);
INSERT INTO article (preis, amount) VALUES (14.99, 15);
INSERT INTO article (preis, amount) VALUES (15.99, 3);
INSERT INTO app_user (nickName, role, password) VALUES ('user1', 1, '***');
INSERT INTO app_user (nickName, role, password) VALUES ('user2', 2, '***');
INSERT INTO app_user (nickName, role, password) VALUES ('user3', 2, '***');
INSERT INTO app_user (nickName, role, password) VALUES ('user4', 2, '***');
INSERT INTO app_user (nickName, role, password) VALUES ('user5', 2, '***');
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (1, 1, 3);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (1, 2, 2);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (1, 3, 5);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (2, 4, 10);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (2, 5, 2);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (3, 2, 2);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (3, 4, 4);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (4, 1, 1);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (4, 5, 1);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (5, 2, 1);
INSERT INTO user_ordered_article (userId, articleId, amount) VALUES (5, 4, 1);
