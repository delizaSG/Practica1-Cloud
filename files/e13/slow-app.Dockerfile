# Utiliza una imagen base oficial de Python con la versión 3.8
FROM python:3.8-slim

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el script de inicio al directorio de trabajo
COPY slow-start.py /app/

# Instala las dependencias necesarias, si las hubiera
# Ejemplo: RUN pip install <nombre del paquete>

# Define una variable de entorno si es necesario
# Ejemplo: ENV MY_VARIABLE=valor

# Exponer puertos si es necesario
# Ejemplo: EXPOSE 8080

# Ejecuta el script de inicio cuando el contenedor se inicie
CMD ["python", "slow-start.py"]
