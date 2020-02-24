INSERT INTO `db_bookshelf`.`genres` (`id`, `name`) VALUES ('1', 'Crime/Mystery');
INSERT INTO `db_bookshelf`.`genres` (`id`, `name`) VALUES ('2', 'Horror');
INSERT INTO `db_bookshelf`.`genres` (`id`, `name`) VALUES ('3', 'Romance');
INSERT INTO `db_bookshelf`.`genres` (`id`, `name`) VALUES ('4', 'Science Fiction');
INSERT INTO `db_bookshelf`.`genres` (`id`, `name`) VALUES ('5', 'Young Adult');

INSERT INTO `db_bookshelf`.`books` (`id`, `title`, `author`, `genre_id`) 
VALUES ('1', 'Sense and Sensibility', 'Jane Austen', '3');

INSERT INTO `db_bookshelf`.`books` (`id`, `title`, `author`, `genre_id`) 
VALUES ('2', 'Death On the Nile', 'Agatha Christie', '1');

INSERT INTO `db_bookshelf`.`books` (`id`, `title`, `author`, `genre_id`) 
VALUES ('3', 'Dracula', 'Bram Stoker', '2');