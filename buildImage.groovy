def call(dockerImage) {
    echo 'Building docker image ...'
    docker.build("${dockerImage}")

    return "${dockerImage}"
}