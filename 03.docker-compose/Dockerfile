FROM node:alpine

WORKDIR '/project'
COPY ./package.json ./
RUN npm install
COPY . .

CMD ["npm", "start"]