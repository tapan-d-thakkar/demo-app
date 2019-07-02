FROM alfresco/process-services:1.9.0
LABEL author="Tapan"
LABEL email="tapan.d.thakkar@gmail.com"

ENV PORT 8080
EXPOSE 8080

RUN unzip -qq /usr/local/tomcat/webapps/activiti-app.war -d /usr/local/tomcat/webapps/activiti-app/
COPY target/*.jar /usr/local/tomcat/webapps/activiti-app/WEB-INF/lib/demo-app-jar-2.0.jar