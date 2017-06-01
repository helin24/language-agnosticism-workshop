## Differences between languages

### Primary Applications and Community

#### Description
- Languages can have different use patterns, e.g. more common in different fields
- For example, python vs. ruby, which are considered similar in being higher-level, very readable interpreted languages
  - ruby is predominantly used in web development, largely because of the rails framework (makes setting up web applications fast)
  - python is used in web development too (and has the django framework), but is also frequently used in academic settings and data analysis
  - [link with further comparisons](https://learn.onemonth.com/ruby-vs-python-4b030a408170)
- Could be due to qualities or historical origins of language
- Community of users can affect how a language evolves or what libraries are available
  
#### Is this important? 
For companies/projects:
- Choosing languages with a strong community is important for being able to hire experienced engineers
- May be necessary to choose a language with tools well-suited to goals

For you:
- If you know you want to work in a specific field, it may be important to choose a language that is commonly used. For example:
  - Data science: python, R
  - Web development: ruby, python, java
  - Mobile applications: java, swift, Objective C
- Absent a clear career goal, it's okay to start with any established languages and pivot to something else when the need arises
- Some links for choosing a language:
  - [treehouse link](http://blog.teamtreehouse.com/choose-programming-language)
  - [an app with a quiz!](http://www.bestprogramminglanguagefor.me/)

### Higher or lower level languages

#### Description
- Higher-level languages do more for you by default, because they abstract away some details of lower-level languages
- Examples of lower-level languages:
  - Assembly, where you interact closely with computer hardware
  - C, where you allocate memory for variables
- Most of the more 'modern' languages are higher-level, like Python, Ruby, PHP, Java, and others (which are often written in C)
- Lower-level languages [can be faster](https://medium.com/@LoopPerfect/why-are-low-level-languages-fast-and-high-level-languages-slow-9034c7e74da8) because you interact more directly with tools that execute your code, allowing for finer optimization

#### Is this important?
For companies/projects:
- Lower-level languages may be needed for applications where speed is essential, e.g. video processing is often done in C
- Prototyping of projects may be done in higher-level languages if fast setup is needed but scale is not needed right away

For you:
- Higher-level languages can be easier to learn because you don't have to manage as many details yourself
- Lower-level languages can be good to learn if you have the time/resources (e.g. a supportive classroom environment), because it'll teach you more details about programming in general

### Libraries

#### Description
- Pre-written pieces of code that may be part of a programming language or written by third parties to do something that the language doesn't do by default
- Every language has their own libraries
- In most established languages, there will be libraries to do common things, though they will be implemented differently. For example:
  - Mathematical functions
  - Dealing with time and date

#### Is this important?
For companies/projects:
- Established languages with a lot of well-tested libraries can make a big difference in being able to produce reliable applications quickly

For you:
- Some languages involve more explicit requiring of libraries at the outset, so it's good to find an introductory tutorial that addresses how to use libraries
- Eventually this will be relevant for most languages, so it shouldn't be a deciding factor for choosing a language

### Age

#### Description
- New programming languages are written all the time
- Newer languages tend to be built with well-liked aspects of existing languages, for example:
  - Clean syntax without `{}`s or ending with `;`s
  - Compiling to fast existing languages (e.g. Clojure compiles to Java byte code, Elixir compiles to Erlang)
- Older languages usually have the benefit of large communities and assurance that they work in large-scale projects
- Diagrams of languages over time:
  - ['simpler' diagram](http://rigaux.org/language-study/diagram-light.png)
  - [Crazier diagram of languages over time](https://www.levenez.com/lang/)

#### Is this important?
For companies/projects:
- Generally easier to find engineers to hire with experience in established languages
- Established languages usually also have better documentation and libraries 
- Sometimes companies develop new languages for their own purposes

For you:
- Having an older language on your resume can be good because more companies use those
- An older language may be more sytactically clunky, but there will likely be more guides and stackoverflow answers if you get stuck
- Most programming concepts will still be shared among newer and older languages

### Compiled vs. Interpreted

#### Description
- Compiled languages require a step where, after writing the code, you use a 'compiler' to change your code into something closer to 'machine' code
  - e.g. Java is compiled into bytecode, which is executed by a Java Virtual Machine ([more complicated details](https://stackoverflow.com/questions/1326071/is-java-a-compiled-or-an-interpreted-programming-language))
- Interpreted languages are read and executed by some other program on a machine, and therefore don't have a compile step 
  - e.g. Ruby and Python are interpreted languages that are run by `ruby` and `python` programs respectively
- Generally, compiled languages are slower/harder to code, but run faster once compiled, since there isn't translation time required at runtime into a machine's native code
- Interpreted languages are considered easier/more convenient to code, but usually run more slowly. 
- [More detailed description](https://stackoverflow.com/questions/3265357/compiled-vs-interpreted-languages)

#### Is this important?
For companies/projects:
- Sometimes very large-scale projecs that process large amounts of data, serve many requests, etc. may require using compiled languages for the gain in speed
- Many large companies also use interpreted languages successfully for running large projects too
- Many companies use both types of languages for different purposes

For you:
- The coding part of either type of language will not be that different
- It could be harder to set up your programming environment for a compiled language initially, because you'll need to learn how to do the compiling, but you would get used to this quickly

### Paradigm

#### Description
- A style of programming ([wikipedia description](https://en.wikipedia.org/wiki/Programming_paradigm)), for example:
  - Object-oriented describes a style of programming where code is organized into classes, and instances of classes (objects) can execute common functions but keep track of their own state
  - Functional describes a style where instead of mutating values (or objects), values are passed through multiple functions to return a different value
  - There are many others, and also many definitions that may be conflicting!
- Some languages are closely associated with a style of programming, e.g. Haskell supports functional programming
- Many languages support using multiple paradigms - for example:
  - Java supports object-oriented by having classes and inheritance
  - Java `stream`s are an example of functional programming ([more details on streams](http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)).

#### Is this important?
For companies/projects:
- Some paradigms are more commonly used than others (object-oriented is very popular, but functional seems to be considered more exciting these days)
- Most organizations probably use different paradigms for different purposes, so this doesn't have significant implications for language choice

For you:
- Discussions about language paradigms come up often, so it's good to have a general sense of what that means
- Changing programming paradigm can be disorienting, probably harder than changing between most languages
- Not important in choosing a language to start with, since most languages can be used within different paradigms

### Language 'typing'

#### Description
- Statically typed languages 
  - Require that the programmer specify what type of value a variable contains, e.g. in Java `int x = 1`
  - Compiler will make sure that values assigned to variables match their stated type, e.g. in Java `String y = 20` will throw an error
- Dynamically typed languages
  - No need to specify variable types
  - Variables can be assigned to different types of values during the course of a program, e.g. this is valid in Ruby/Python:
  ```
  x = 12
  x = "Changed my mind, now it's a string"
  ```
- Whether languages are 'strongly' or 'weakly' typed is [vaguely defined](https://stackoverflow.com/questions/121385/what-are-the-key-aspects-of-a-strongly-typed-language), but one definition refers to whether variable types are automatically converted during operations involving other variable types, for example:
```
x = "14"
y = x + 2
# valid if 'weakly' typed, invalid if 'strongly' typed
```

#### Is this important?
For companies/projects and you:
- Not really important
- There are positives to both, and so it doesn't make a language harder or easier.
  - It can be easier to find bugs in statically typed languages since a compiler will catch instances where a wrong type is assigned
  - But a dynamically typed language can be more flexible in what assignments are performed, potentially making it faster to write

