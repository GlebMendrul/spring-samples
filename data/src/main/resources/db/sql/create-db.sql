DROP TABLE IF EXISTS test.orders;
CREATE TABLE test.orders (
  id          INT            NOT NULL AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(512)   NOT NULL,
  date_ins    TIMESTAMP      NOT NULL,
  price       DECIMAL(12, 2) NOT NULL,
  customer_id INT            NOT NULL
);