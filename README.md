# AREP - PARCIAL PRIMER CORTE - DYNO CALCULATOR

## Getting Started

### Pre-requisites

You need to have installed on your PC:

- JDK 
- Maven 
- Git

### Installing

Open a command prompt on the folder that you are going to save this project and copy:

```
git clone https://github.com/CarlosGomez380/ParcialArep1.git
```

Once finish this process, open the project on the terminal with 

```
cd ParcialArep1
```

And copy:

```
mvn clean install
```

## Deployment

To deploy this project open the folder of this project and a command prompt on this location and copy:

```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.lab1.CalculatorOperator
```

Open your browser and type:

```
http://localhost:4567/inputdata
```


## Heroku deployment

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://damp-springs-33229.herokuapp.com/inputdata)

## Built With

- [Maven](https://maven.apache.org/) - Dependency Management

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
