# Getting Started - af-auth-service
1. Read the readme
2. Download & setup source code
3. Build Docker image (If docker is to be used)

# Download & Setup Source Code

## Finding The af-auth-service Repo
The main branch of *af-auth-service* located [here](https://github.com/Batch-944-Adam-Ranieri/af-location-service)

### Downloading The Project
> Clicking on 'Code' on the upper-right hand of the **GitHub** project and clicking *Download ZIP*.

***OR***

### Cloning the repository
> Using Git in your preferred local directory, use the following command to clone the project onto your machine:
>
``git clone https://github.com/Batch-944-Adam-Ranieri/af-location-service.git``

# Local Project

### Prequisites
> PostgreSQL >= 12
> Java 1.8

## Running the Project
- While in the root directory of the project use the command `gradlew bootJar`
- Then navigate to the libs folder `./af-location-service/build/libs`
- Then run the jar file using `java -jar [filename]`

# Running the Project Using Docker

### Prequisites
> Docker

## Running the Project
- `docker build -t location-service-image`
- `docker run -p 8080:9000 location-service-image`