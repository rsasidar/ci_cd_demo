# Pull the base OS
FROM maven:alpine

# Exposing required ports
EXPOSE 9091

# Mounting project direcotry
ADD . /demo
WORKDIR /demo


# Navigate to project directory
RUN cd /demo

CMD ["/bin/sh"]
