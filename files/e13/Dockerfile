# Use an official Python runtime as a parent image
FROM python:3.8-slim

# Copia un script de inicio al contenedor
COPY slow-start.py /app/slow-start.py

# Ejecuta el script de inicio cuando el contenedor se inicie
CMD ["python", "/app/slow-start.py"]
