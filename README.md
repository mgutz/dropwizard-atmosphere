## Introduction

The [Dropwizard](http://dropwizard.codahale.com/) example integrated with [Atmosphere](https://github.com/Atmosphere/atmosphere) rest-chat example.

## Overview

Dropwizard is a high performance JVM REST framework built upon proven production JVM technologies.

Atmosphere provides server side push technology using websockets when it can and
gracefully degrades to long polling for browsers that suck.

# Running The Application

To test the example application run the following commands.

*   To package the example run.

        mvn package

*   To run the server run.

        java -jar target/dropwizard-example-0.3.0-SNAPSHOT.jar server example.yml

To test chat, which purposely resides in its own directory to excercise CORS

*   Browse the file

        apps/chat.html

