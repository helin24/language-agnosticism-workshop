## Differences between languages

### Higher or lower level languages

#### Description
Higher level languages generally do more for you by default - they’re created as abstractions of lower level languages. An analogy could be that a direct supervisor might give detailed directions to employees, but a CEO probably gives much higher-level instructions that aren’t as detailed. The lowest level languages are things like Assembly, where you interact very closely with computer hardware. A language like C is considered low-level because you have to manage memory and where variables are stored while programming. Meanwhile, languages like python, ruby, PHP, Java, others (which are often written in C!) will manage memory and variables for you. However, this doesn’t mean that you can’t do powerful things in a low-level language, you just might need libraries of pre-written code to make it easier. Lower level languages [can be faster](https://medium.com/@LoopPerfect/why-are-low-level-languages-fast-and-high-level-languages-slow-9034c7e74da8) because you’re interacting more directly with the stuff that’s executing your code.

#### Is this important?
Sort of. Lower level languages can be harder to learn because you have to manage the details yourself, so it’s often easier to start learning programming with a higher-level language. On the other hand, if you have the resources (e.g. time, a supportive classroom environment, etc.), learning a lower level language can be a more thorough way to understand programming.

### Primary Applications and Community

#### Description
Languages that do not differ much by syntax can have different use patterns. For example, ruby and python are considered very similar in that they’re both higher-level, very readable languages. However, ruby is predominantly used in web development (largely because of the rails framework, which makes setting up web applications easier). Python is often used in web development too (and python's django framework is comparable to rails), but it's also frequently used in academic settings and for data analysis ([link with further comparisons](https://learn.onemonth.com/ruby-vs-python-4b030a408170)). Sometimes these differences are due to the origins of a language or because of qualities of the language, and sometimes the community that a language attracts is inertial - it attracts more people who are doing similar things, or causes the language/libraries to evolve differently to cater to those needs.

#### Is this important? 
It’s fine to choose a language sort of at random or choose one based on your opportunity set (i.e. what jobs you're offered or what classes you're taking), but if you really want to work in a specific field of software engineering, this may be important. E.g. if you want to do data science - python or R, maybe. Web development - ruby. Mobile apps - java, swift, objective C. Not necessarily because this will change what you’ll learn significantly, but because it could give you an entry point to network with people, feel more specifically prepared for jobs in the field, etc. If you don't have a clear career goal and you just want to learn programming, it's okay to start with any established language (to make sure you can find tutorials and good documentation) and pivot to something else when the need arises.
Some links for choosing a language:
- [treehouse link](http://blog.teamtreehouse.com/choose-programming-language)
- [an app with a quiz!](http://www.bestprogramminglanguagefor.me/)

### Libraries

#### Description
Libraries are pre-written pieces of code that may be part of a core programming language or may be custom libraries written by third parties. Every language has their own libraries, but the concept of libraries means that in most established languages, it’s not hard to do basic things. If many programmers use a language and realize they have repeated needs for a certain function (for example, translating milliseconds to datestamps), then it’s likely that it will make it into a library somewhere. For this reason, even a language like C (which is considered ‘small’ for not having many functions in its core) can still be used effectively, because there are many libraries that can supplement with other useful functions.

#### Is this important?
Sort of. This can be a hurdle when learning a new language that relies heavily on importing libraries, so it's good to find an introductory text/tutorial that addresses how to use library functions.

### Age

#### Description
New programming languages are written all the time, so there's always chatter about how shiny and wonderful they are, generally paired with complaints about how terrible and clunky old languages are. There are positive aspects of being both new or old. New languages tend to be built with well-liked aspects of existing languages (e.g. clean syntax, compiling to fast existing languages). However, old languages have the benefit of large communities and the assurance that they work in large-scale projects.
Related links:
- [Diagram of languages over time](http://rigaux.org/language-study/diagram-light.png)
- [Crazier diagram of languages over time](https://www.levenez.com/lang/)

#### Is this important?
Again, sort of. It's worthwhile having an old language on your resume because there are many more companies that use, for example, PHP, than Dart (which I've been told is, of course, infinitely better). It's also helpful learning an old language that doesn't necessarily have the cleanest syntax because there will be more guides and stackoverflow answers to help you if you get stuck. But again, new and old languages will still share many programming concepts, so you will be able to apply your learnings in both directions!

### Compiled vs. Interpreted

#### Description
Compiled languages require a step where, after writing the code, you use a 'compiler' to change your code into something closer to 'machine' code - for example, Java is compiled into bytecode, which is executed by a Java Virtual Machine ([more complicated details](https://stackoverflow.com/questions/1326071/is-java-a-compiled-or-an-interpreted-programming-language)). Interpreted languages are read and executed by some other program on a machine, and therefore don't have a compile step (Ruby and Python are interpreted languages that are run by `ruby` and `python` programs respectively). Generally, compiled languages are slower/harder to code, but run faster once compiled, since there isn't translation time required at runtime into a machine's native code. Interpreted languages are considered easier/more convenient to code, but usually run more slowly. ([More detailed description](https://stackoverflow.com/questions/3265357/compiled-vs-interpreted-languages)

#### Is this important?
It depends on your project. Very large-scale project may require using compiled languages to process large amounts of data or serve many requests quickly, but this is highly contended and many large companies use interpreted languages successfully. If you're getting started learning how to program, this is not important. Similar programming concepts are present in both types of languages. It may be harder to set up your programming environment for a compiled language initially since the extra compiling step is required, but this is also something that you would get used to quickly.

### Paradigm

#### Description
A paradigm is a style of programming ([wikipedia description](https://en.wikipedia.org/wiki/Programming_paradigm)). For example, object-oriented describes a style of programming where code is organized into classes, and instances of classes (objects) can execute common functions but keep track of their own state. Some languages are closely associated with a style of programming, for example, Haskell supports functional programming, where instead of mutating variables, values are passed through multiple functions to result in a different value. Meanwhile, many languages support many programming paradigms - Java supports object-oriented programming by having classes and inheritance, but Java `stream`s are an example of functional programming ([more details on streams](http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)).

#### Is this important?
Yes, but not really in the context of choosing a language. Discussions about object-oriented, functional, imperative, etc. come up often, so it's good to have a vague general sense of them. Going from programming with an object-oriented paradigm (where you change the state of objects) to a functional paradigm (where you can't change the state of objects!) is disorienting, probably harder than changing between most languages. However, since many paradigms are often available in a single language, you can always get used to a language and then explore different paradigms within it. For example, Ruby is commonly used with an object-oriented paradigm, but functions like `.map` or `.reduce` are common functional paradigm ideas.

### Language 'typing'

#### Description
Languages can be referred to as statically vs dynamically typed. Statically typed languages require that we specify what type of data a variable contains, and a compiler will make sure that values assigned to variables match theyr stated type. When coding in a dynamically typed language, we don't need to specify variable types, and variables can be assigned to different types of values during the course of a program.

There's also a concept of whether languages are 'strongly' or 'weakly' typed, but this is [vaguely defined](https://stackoverflow.com/questions/121385/what-are-the-key-aspects-of-a-strongly-typed-language). One definition refers to whether variable types are automatically converted during operations involving other variable types.

#### Is this important?
Not really, there are positives of both statically and dynamically typed languages, and this trait does not make a language more or less difficult. It may be easier to find bugs in statically typed languages since a compiler will catch any instances where a wrong type is assigned to a variable. But dynamically typed languages can be a little faster since no type declarations are necessary.
