FROM node:alpine 
WORKDIR /project
COPY ./package.json ./
RUN npm install
COPY ./index.js ./
CMD ["npm", "start"]
