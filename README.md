# ANZWholesale

Before start executing this project need to follow an instruction below

Install MongoDB Community Edition
------------------------------------

> brew tap mongodb/brew

From a terminal, issue the following:

> brew install mongodb-community@4.0

> mongod --config /usr/local/etc/mongod.conf

To starting the service

> brew services start mongodb-community@4.0

To stopping the servcie

> brew services stop mongodb-community@4.0

How to run the code:
-----------------------
Note: Java 8 is necessary to run this application

use clone command below

> git clone https://github.com/mrsanthosh84/ANZWholesale.git 

run the code, Before running make sure your MongoDB service is running an instance

> javac Application.java

> java Application

I've worte a certain test cases to verify the data has been installed and view accountList and account Transactions list

