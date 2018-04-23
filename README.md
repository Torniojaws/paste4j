# Paste4j :)

Java version of the Paste 4.0 feature, using MongoDB. Mostly to refresh the memories and also create an updated version of the tool itself.

## Tools and deployment

Will probably use Eclipse and Maven, and then deploy the WAR file on Jetty as a standalone service running on the existing unrelated server. Should be fine to run it alongside MariaDB. No need for a domain, as this is only for personal use. The access would be eg. domain:8081

## Tests

Yes.

## Running

Build the WAR (eg. ``mvn package``), and then launch with Jetty: ``java -jar jetty.jar --port 8081 /path/to/paste4.war``. Then open http://localhost:8081

## Todo

- Setup project v0.0.1 and push to Github
- Play around
- What kind of endpoints?
- Create a simple frontend
