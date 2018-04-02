# Intro

Legacy production code is not always as pristine as a stand alone kata. I created this test to combine both. It presents candidates with lots of little pit falls and things in the wrong place. Implementation in the wrong place, lying tests, the wrong sorts of testing, not using inversion of control, behaviuor in a DTO and a number of other things.

I run this as a psuedo-pairing exercise with a timebox of about an hour. With a short time window the goal is not to complete it but to see how individuals deal with seemingly simple problems in contexts which promote bad habits.

Interestingly, few candidates get a _working_ solution (which is good), but it gives insights into how they deal with crap code. Will the candidate practice TDD or just run with the integration test? Will the Fibonaci seq be calculated where it is. Will the candidate just hard code the seq?


Throwing this out there since it's a bit out dated now. Feel free to fork and use it for your own assessment. Just watch out since it's now available here.

# Candidate Assessment
Read through both parts before continuing.

## Part 1 - Expose a fibonacci service
Your goal is to implement a service, which will return the first n
values in the fibonacci series, starting at 0.

* You may cap n at a sensible maximum if you are concerned about service stability.
1 - The controller should satisfy a contract of GET /fibonacci/<n> where n is an integer
2 - This should return a json payload with an ordered array of the first n integers in the fibonacci series.
3 - We need confidence in the behaviour of this solution.
4 - Ideally your tests are fast and help you discover the solution.

* Please apply production practices and let us know where you compromise on this 
* You are not being assessed on getting it working, but how you attempt to get it to work.
* You may add any additional dependencies or libraries

## Part 2 - Expose a web interface for entering and displaying fibonacci numbers
Your goal is to create a web interface which allows users to enter the number of fibonacci elements they wish to view, and display it to them.

1 - Build an interface which allows users to submit a number.
2 - Send an AJAX request to your backend
3 - Display the result
4 - Style your interface appropriately, based on the available time constraints.

# Technical Direction
We prefer:
* DDD principles
* Readable implementation
* The use of Swagger contracts to describe our services
* A wider breath of unit tests and dependencies discovered through TDD
* Sensible documentation on public interfaces
* Please refactor as needed
* Please clean the code as you go. Eg. 'The (girl|boy) scout rule'
* You have confidence in your running application.

# Business Rules:
## What is the Fibonacci Series:
0, 1, 1, 2, 3, 5, 8, 13, ...

It is defined by the following rules:
* The first two numbers in the Fibonacci sequence are either 1 and 1, OR 0 and 1
* Each subsequent number is the sum of the previous two.
* We prefer the modern sequence starting with 0 and 1

You may review: https://en.wikipedia.org/wiki/Fibonacci_number
