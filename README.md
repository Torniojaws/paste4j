# Paste4j :)

Java version of the Paste 4.0 feature, using MongoDB. Mostly to refresh the memories and also create
an updated version of the tool itself.

## Tools and deployment

Deploy the WAR file on Jetty as a standalone service running on the existing server.
Should be fine to run it alongside MariaDB. No need for a domain, as this is only for personal use.
The access would be eg. domain:8081

## Tests

Yes.

## Running locally

1. Clone the project
1. Download the jaxrs-ri-2.27.zip (or newer) from https://jersey.github.io/download.html
1. Extract all the JAR files in it to the same level (= no dirs) in ``WEB-INF/lib/``
1. Run ``make build``
1. Launch the WAR with Jetty: ``java -jar deployment/jetty-runner-9.4.9.v20180320.jar --port 8081 paste4j.war``
1. Then open http://localhost:8081/rest/hello
1. You should see a message "Hello there"

## Todo

- Play around
- Implement the endpoints mentioned in the project Issues
- Create a simple bootstrap frontend
- Use Ansible playbooks?
