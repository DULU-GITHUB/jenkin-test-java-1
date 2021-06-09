From openjdk:8
copy ./target/prac_spr-0.0.1-SNAPSHOT.jar prac_spr-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","prac_spr-0.0.1-SNAPSHOT.jar"]