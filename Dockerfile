# Temel imaj olarak OpenJDK 17 kullanılıyor
FROM openjdk:21-jdk-slim

# Uygulama içindeki çalışma dizini
WORKDIR /app

# Maven kullanarak oluşturduğunuz JAR dosyasını kopyala
COPY target/*.jar app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "app.jar"]
