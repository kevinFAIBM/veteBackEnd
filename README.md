# veteBackEnd
## Vete orchestrator

## Step 1

### Put veterinary
#### http://localhost:8080/Vete/save/207340818

{
    "vetId" : 207340818,
    "vetName" : "Kevin",
    "vetSpeciality" : "Cann",
    "experience" : 2.0,
    "clinic" : "Central"
}

## Step 2

### Get Veterinary data
#### http://localhost:8080/Vete?VeterinaryId=207340817


## Step 3

### Put the Animal
#### http://localhost:8080/Animals/save/207340818
{
    "animalId" : "207340819",
    "animalName" : "Pepe",
    "type" : "Sagua",
    "breed" : "Sagua",
    "ownerName" : "Kevin",
    "vetId" : "207340818"
}


## Step 4

### Get animal by ID
#### http://localhost:8080/Animal?animalId=207340819

## Step 5 

### Get the animal by Name
#### http://localhost:8080/AnimalByName?animalName=Pepe













