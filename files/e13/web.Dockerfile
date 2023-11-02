# Utiliza una imagen oficial de NGINX como imagen base
FROM nginx:alpine

# Copia un archivo HTML de ejemplo al directorio web de NGINX
COPY index.html /usr/share/nginx/html/index.html
