build:
	javac -classpath "WEB-INF/lib/*" WEB-INF/classes/com/paste/ws/*.java
	jar -cvf paste4j.war WEB-INF/*
