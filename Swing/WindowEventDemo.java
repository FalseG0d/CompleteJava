[MAIT@localhost ~]$ su
Password: 
[root@localhost MAIT]# mysql
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 8
Server version: 10.2.16-MariaDB MariaDB Server

Copyright (c) 2000, 2018, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> create database d1;
Query OK, 1 row affected (0.00 sec)

MariaDB [(none)]> use d1;
Database changed
MariaDB [d1]> create table students(id int, name varchar(20), email varchar(20));
Query OK, 0 rows affected (0.14 sec)
MariaDB [d1]> insert into students(id,name,email) values(1, "abc", "abc@gmail.com");
Query OK, 1 row affected (0.03 sec)

MariaDB [d1]> select *from students;
+------+------+---------------
| id   | name | email         |
+------+------+---------------
|    1 | abc  | abc@gmail.com |
+------+------+---------------
1 row in set (0.00 sec)

MariaDB [d1]> alter table students add(age int);
Query OK, 0 rows affected (0.32 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [d1]> select * from students;
+------+------+---------------
| id   | name | email         | age  |
+------+------+---------------
|    1 | abc  | abc@gmail.com | NULL |
+------+------+---------------
1 row in set (0.00 sec)
MariaDB [d1]> alter table students rename to stud;
Query OK, 0 rows affected (0.19 sec)

MariaDB [d1]> select * from stud;
+------+------+---------------
| id   | name | email         | age  |
+------+------+---------------
|    1 | abc  | abc@gmail.com |   19 |
+------+------+---------------
1 row in set (0.03 sec)

MariaDB [d1]> create table t1 (name varchar(10));
Query OK, 0 rows affected (0.40 sec)

MariaDB [d1]> drop table t1;
Query OK, 0 rows affected (0.13 sec)

















MariaDB [d1]> update students set age = 19 where age=NULL;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0

MariaDB [d1]> select * from students;
+------+------+---------------
| id   | name | email         | age  |
+------+------+---------------
|    1 | abc  | abc@gmail.com | NULL |
+------+------+---------------
1 row in set (0.00 sec)

MariaDB [d1]> update students set age = '19' where name ="abc";
Query OK, 1 row affected (0.03 sec)
Rows matched: 1  Changed: 1  Warnings: 0

MariaDB [d1]> select * from students;
+------+------+---------------
| id   | name | email         | age  |
+------+------+---------------
|    1 | abc  | abc@gmail.com |   19 |
+------+------+---------------
1 row in set (0.00 sec)

MariaDB [d1]> insert into stud values (2, "xyz", "xyz@gmail.com", 18);
Query OK, 1 row affected (0.06 sec)

MariaDB [d1]> select * from stud;
+------+------+---------------
| id   | name | email         | age  |
+------+------+---------------
|    1 | abc  | abc@gmail.com |   19 |
|    2 | xyz  | xyz@gmail.com |   18 |
+------+------+---------------
2 rows in set (0.00 sec)

MariaDB [d1]> delete from stud where name="abc";
Query OK, 1 row affected (0.06 sec)

MariaDB [d1]> select * from stud;
+------+------+---------------
| id   | name | email         | age  |
+------+------+---------------
|    2 | xyz  | xyz@gmail.com |   18 |
+------+------+---------------
1 row in set (0.00 sec)

