# Trabalho sobre thrift


# Cnsiderações Iniciais
O ambiente de desenvolvimento do mesmo foi em um Linux Ubuntu 20.04.01. Para que o projeto rode normalmente é necessário que se tenha configurado na máquina:

Apache Thrift
link: https://thrift.apache.org/docs/install/debian.html

JDK 08 ou superior
Poder ser instalado pelo comando sudo apt install openjdk-8-jdk 
u utilizat a versão default sudo apt install default-jdk

## Comando para rodar o pbojeto
Primeiramente abra a pasta do projeto e utilize os comandos a seguir:

### Criar arquivos Java
thrift --gen java valor.thrift

### Compilar os arquivos
javac -cp jars/libthrift-0.13.0.jar:jars/slf4j-api-1.7.21.jar:jars/javax.annotation-api-1.3.2.jar:gen-java -d . *.java

### Inciar o serviço
java -cp jars/libthrift-0.13.0.jar:jars/slf4j-api-1.7.21.jar:jars/javax.annotation-api-1.3.2.jar:gen-java:. valor.Server

### Inciar o cliente
Abra uma nova Aba no terminal e excute o seguinte comando: 
java -cp jars/libthrift-0.13.0.jar:jars/slf4j-api-1.7.21.jar:jars/javax.annotation-api-1.3.2.jar:gen-java:. valor.Cliente