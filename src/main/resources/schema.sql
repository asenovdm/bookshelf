DROP TABLE IF EXISTS `db_bookshelf`.`books`;
DROP TABLE IF EXISTS `db_bookshelf`.`genres`;

CREATE TABLE `db_bookshelf`.`genres` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `db_bookshelf`.`books` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `genre_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_idx` (`genre_id` ASC) VISIBLE,
  CONSTRAINT `fk`
    FOREIGN KEY (`genre_id`)
    REFERENCES `db_bookshelf`.`genres` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);