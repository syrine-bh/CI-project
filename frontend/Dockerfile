FROM node:16.17-alpine3.15 as build
WORKDIR /usr/local/app

COPY ./ /usr/local/app/

RUN npm install --force

RUN npm run build


FROM nginx:latest
# Copy the build output to replace the default nginx contents.
COPY --from=build /usr/local/app/dist/crudtuto-Front /usr/share/nginx/html

EXPOSE 80
