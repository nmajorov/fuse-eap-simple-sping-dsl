WildFly Camel Spring XML Web Application
=============

This is a template Apache Camel Spring application for the JBOSS FUSE 6.3
Prerequisites
=============

* Minimum of Java 1.7
* Maven 3.2 or greater
* JBOSS FUSE FOR EAP 6.3

Building the application
------------------------

To build the application do:

    mvn clean install


Run Arquillian Tests
--------------------

By default, tests are configured to be skipped as Arquillian requires the use of a container.

If you already have a running application server, you can run integration tests with:

    mvn clean test -Parq-remote

Otherwise you can get Arquillian to start and stop the server for you (Note: you must have $JBOSS_HOME configured beforehand):

    mvn clean test -Parq-managed


Deploying the application
-------------------------

To deploy the application to a running application server do:

    mvn clean package wildfly:deploy

The server console should display lines like the following:

    (MSC service thread 1-16) Apache Camel (CamelContext: spring-context) is starting
    (MSC service thread 1-16) Camel context starting: spring-context
    (MSC service thread 1-6) Bound camel naming object: java:jboss/camel/context/spring-context
    (MSC service thread 1-16) Route: route4 started and consuming from: Endpoint[direct://start]
    (MSC service thread 1-16) Total 1 routes, of which 1 is started


Access the application
----------------------

The application will be available at http://localhost:8080/spring-dsl/services/ping?wsdl


Undeploying the application
---------------------------

    mvn wildfly:undeploy


Further reading
---------------



Apache Camel documentation

http://camel.apache.org/
