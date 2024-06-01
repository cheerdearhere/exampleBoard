# set database
create database db_test_board;
create user user_testboard@localhost identified by '1234';
grant all privileges on db_test_board.* to user_testboard@localhost;