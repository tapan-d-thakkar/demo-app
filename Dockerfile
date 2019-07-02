FROM 823639940192.dkr.ecr.us-east-1.amazonaws.com/alfresco:latest
LABEL author="Tapan"
LABEL email="tapan.d.thakkar@gmail.com"

ENV PORT 8080
EXPOSE 8080

RUN unzip -qq /usr/local/tomcat/webapps/activiti-app.war -d /usr/local/tomcat/webapps/activiti-app/
COPY target/demo-app-jar-2.0.jar /usr/local/tomcat/webapps/activiti-app/WEB-INF/lib/demo-app-jar-2.0.jar