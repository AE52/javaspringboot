# Temel imaj
FROM openjdk:17-jdk-slim

# Çalışma dizinini ayarla
WORKDIR /app

# JAR dosyasını kopyala
COPY target/my-spring-boot-app.jar app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "app.jar"]
