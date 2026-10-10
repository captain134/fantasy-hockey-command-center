FROM node:22-alpine
WORKDIR /app
LABEL org.opencontainers.image.title="IceIQ Fantasy Hockey Command Center" \
      org.opencontainers.image.description="Matchup-first fantasy hockey intelligence for Unraid" \
      org.opencontainers.image.source="https://github.com/captain134/fantasy-hockey-command-center" \
      org.opencontainers.image.version="5.5.0"
COPY package*.json ./
RUN npm install --omit=dev
COPY . .
RUN mkdir -p /config
ENV NODE_ENV=production PORT=3000 CONFIG_DIR=/config
EXPOSE 3000
HEALTHCHECK --interval=30s --timeout=5s --start-period=15s --retries=3 CMD wget -qO- http://127.0.0.1:3000/health >/dev/null || exit 1
CMD ["npm","start"]
