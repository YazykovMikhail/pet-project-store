docker run -d --rm --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=order-service mysql/mysql-server
