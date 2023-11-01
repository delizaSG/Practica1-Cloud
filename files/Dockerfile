- name: Use an official NGINX image as a parent image
  image: nginx:alpine
  # Copia un archivo HTML de ejemplo al directorio web de NGINX
- name: Copy HTML file to NGINX web directory
  copy:
    src: index.html
    dest: /usr/share/nginx/html/index.html
