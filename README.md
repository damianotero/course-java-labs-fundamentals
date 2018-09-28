# Labs 


## Installation 
Go to the folder where you want to have the project and clone the repository to your machine:

`git clone https://github.com/CodingNomads/javaFundamentalsLabs.git`

Import the project in IntelliJ (It is important to import and not to open because then it will configure itself to be able to be run as java project)

## Git: Workflow 
Create a branch called `yourname_integration` that you will use during the whole course to integrate all your work from subbranches that you will be creating on each topic.

Place yourself into `master` branch and create a new branch:
```git branch yourname_integration```

### Git: Creating a branch for a new topic 
Now you created your integration branch. From now on whenever you will work on a new topic you will create a new branch from this integration branch (`yourname_integration`)

Lets say that you will start working on Part1, you need to create a new branch from your integration branch called 

```yourname_part1``` :

Go to your integration branch:

```git checkout yourname_integration```

Create a new branch for the new topic:

```git branch yourname_part1```

Go to your new topic branch:

```git checkout yourname_part1```

You are ready to start working! Answer the exercises, commit them with a descriptive message and push them to GitHub!

### Git: Creating a new commit 
You have your topic branch set up and you did your work on your local computer. Now you need to get that into Github so everyone else can see it.

Add the files that you modified:

```git add <filename>` or if you prefer you can add all the files that are not staged with `git add .```

Create a commit with the staged files into your current branch:

```git commit -m "Nice descriptive message saying what is included into this commit"```

Push the branch to GitHub:

```git push```

If it is the first time you are doing a push then it will ask you to specify the name for the remote branch to be created:

```git push --set-upstream origin <your current branch name>```

### Creating a pull request 
Now your changes are in GitHub, you just need to create a pull request so we can review your code.

1. In the Github web, go to `Pull Requests` tab

1. Click on the green button that says `New Pull Request`

1. Select your integration branch (`yourname_integration`) as base and your new branch as compare one.

1. Put a nice title and description that says what changes are in this branch.

1. Add the label `ready-for-review`

1. Click on `Create pull request` button.

Done! Now your code will be reviewed by someone.

## Topics 

* Part 1 - Hello world, the main function, printing messages and math
* Part 2 - User input (Scanner), nested-if, switch statement, Loops (while, do-while, for).
* Part 3 - Classes, Objects, Instances, Methods, Variables, Static vs non-Static, Byte Operators
* Part 4 - Arrays, Queues, Stacks, Enhanced for-loop, Collections framework, String, Bubble Sort.
* Part 5 - Access control modifiers, Encapsulation, Overloading methods/constructor, recursion, inner classes, varargs.
* Part 6 - Inheritance, 'super' keyword, constructors calling order, Overriding methods and polymorphism, 'final' keyword. 
* Part 7 - Packages, CLASSHPATH variables, Interfaces, Inheritance.
* Part 8 - Exceptions, Try/catch/finally.
* Part 9 - ByteStreams, Character Streams, try-with-resources, BufferedReader
* Part 10 - Threads/Runnable, multithreading (synchronize, join, sleep, etc).
* Part 11 - Generics types, Generic Wildcard '?'
* Part 12 - Lambdas, functional interfaces, variable capture, exception handling in lambdas.

