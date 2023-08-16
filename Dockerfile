FROM ubuntu

RUN apt-get update && \
    apt-get install openjdk-11-jdk -y && \
    echo 'JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
            export JAVA_HOME \
            export PATH=$PATH:$JAVA_HOME' >> ~/.bashrc

CMD . ~/.bashrc