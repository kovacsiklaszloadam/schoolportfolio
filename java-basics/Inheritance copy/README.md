Inheritance

Inheritance exercises, each task is grouped into a separate package, here are the tasks listed.

Banking package:

# Banking

It is high time to create a bank application that works in our interest!

## Customer

There is a **Customer**  (sometimes called user) class that represent a
customers of a bank

A customer has:

- `name`,
- `age`,
- `gender`
- and can have multiple `bankAccount`s

All of these must be set at creation.

A customer can create a new account (`createAccount(account)`) that:

- Adds a new account (received as parameter) to its `bankAccount` list.
- There cannot be multiple bank accounts for the same **Customer** with
  the same **name**.
- In case of duplicated account name, do not add the account but print:
  `"No account name duplication is allowed"`

A user can send money to another user using the `sendMoney()` method.

- The method shall have the following parameters:
    - the `senderAccountName` of his/her own (sender) account
    - the `partner` (**Customer**)
    - the `partnerAccountName` of the partner's account
    - the `amount` of money to be sent (integer number)

- It shall implement the following logic:
    - If there is no account under the given name (sender's account) it shall
      throw an InvalidParameterException/Error with the message: `"There is no sender account under the name {senderAccountName}"`
    - Reduce the sender's balance with the given amount
    - Set the last usage date of his/her balance to the actual day
    - Add to his/her balance's history the following text: `"2000 Ft sent to Thomas Anderson from the account [Favorite] at 2022.04.20"`
    - If the partner is not present on the transaction partner list of the
      account, add it
    - Call the partner's **receiveMoney()** method
    - Handle relevant transaction fees

The customer has a `receiveMoney()` method

- that has the following parameters:
    - the `receiverAccountName` of the receiver account,
    - the `sender` (**Customer**),
    - the `amount` of the money received
- It shall implement the following logic:
    - If there is no account under the given name (receiver's account) it shall
      throw an InvalidParameterException/Error with the message: `"There is no receiver account under the name [Favorite]"`
    - Increase the receiver's balance with the given amount
    - Set the last usage date of his/her balance to the actual day
    - Add the following text to his/her balance's history:
      `"2000 Ft received from Agent Smith to the account {receiverAccountName} at 2022.04.20"`

    - If the sender is not present on the transaction partner list of the account,
      add it
    - Handle relevant transaction fees

The user shall also have a `generateStatus()` method.

- It shall print all the accounts' string representations to the console

## BankAccount

Every bank account must have

- a `name` (string),
- an `owner` (Customer),
- a `balance` (double/number),
- a `history` (list of strings),
- a `list of transaction partners` (Customers)
- and a `last usage date` (LocalDate)

Bank accounts can be created by giving the `name`, `owner` and the
`starting balance`

A BankAccount can be a `Savings` account:

- Every sending transaction costs 100 Ft
- Every receiving transaction costs 20 Ft

A BankAccount can be a `SpeedUp` account:

- Every sending transaction costs 1000 Ft
- Every receiving transaction costs 200 Ft
- Customer gets 5000 Ft bonus for sending money to a new partner

A BankAccount can be a `Balance` account:

- Every sending transaction costs 0.2% of the money sent
- Every receiving transaction costs 0.3% of the money (on weekends)
- Every receiving transaction costs 0.1% of the money (on weekdays)

Every bank account has a string representation:

```
Family account:
  Account type: "Balance"
  The number of transaction partners: 16
  Last account usage happened 2 days ago
  The actual balance is: 1250.3 Ft
```

Garden application package:

The task is to create a garden application, so in your main method you should create a garden with flowers and trees. 
The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange). 
After creating these plants you should show the user how the garden looks like. After that the program should water the 
garden twice, first with the amount of 40 then with 70.

The Garden
is able to hold unlimited amount of flowers and trees
when watering it should only water those plants that need water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10
The Flower
needs water if its current water amount is less than 5
when watered the flower can only absorb 75% of the water
eg. watering with 10 the flower's amount of water should only increase by 7.5
The Tree
needs water if its current water amount is less than 10
when watered the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase by 4

GreenFoxOrganization package:

# Green Fox inheritance exercise

## Person

Create a `Person` class with the following fields:

- `name`: the name of the person
- `age`: the age of the person (whole number)
- `gender`: the gender of the person (male / female)

And the following methods:

- `getGoal()`: prints "My goal is: Live for the moment!"
- `introduce()`: prints "Hi, I'm `name`, a `age` year old `gender`."

And the following constructors:

- `Person(name, age, gender)`
- `Person()`: sets `name` to Jane Doe, `age` to 30, `gender` to female

## Student

Create a `Student` class that has the same fields and methods as the `Person`
class, and has the following additional

- fields:
    - `previousOrganization`: the name of the student’s previous company / school
    - `skippedDays`: the number of days skipped from the course
- methods:
    - `getGoal()`: prints "Be a junior software developer."
    - `introduce()`: prints "Hi, I'm `name`, a `age` year old `gender` from
      `previousOrganization` who skipped `skippedDays` days from the course
      already."
    - `skipDays(numberOfDays)`: increases `skippedDays` by `numberOfDays`

The `Student` class has the following constructors:

- `Student(name, age, gender, previousOrganization)`: beside the given
  parameters, it sets `skippedDays` to 0
- `Student()`: sets `name` to Jane Doe, `age` to 30, `gender` to female,
  `previousOrganization` to The School of Life, `skippedDays` to 0

## Mentor

Create a `Mentor` class that has the same fields and methods as the `Person`
class, and has the following additional

- fields:
    - `level`: the level of the mentor (junior / intermediate / senior)
- methods:
    - `getGoal()`: prints "Educate brilliant junior software developers."
    - `introduce()`: prints "Hi, I'm `name`, a `age` year old `gender` `level`
      mentor."

The `Mentor` class has the following constructors:

- `Mentor(name, age, gender, level)`
- `Mentor()`: sets `name` to Jane Doe, `age` to 30, `gender` to female, `level`
  to intermediate

## Sponsor

Create a `Sponsor` class that has the same fields and methods as the `Person`
class, and has the following additional

- fields:
    - `company`: name of the company
    - `hiredStudents`: number of students hired
- method:
    - `introduce()`: prints "Hi, I'm `name`, a `age` year old `gender` who
      represents `company` and hired `hiredStudents` students so far."
    - `hire()`: increases `hiredStudents` by 1
    - `getGoal()`: prints "Hire brilliant junior software developers."

The `Sponsor` class has the following constructors:

- `Sponsor(name, age, gender, company)`: beside the given parameters, it sets
  `hiredStudents` to 0
- `Sponsor()`: sets `name` to Jane Doe, `age` to 30, `gender` to female,
  `company` to Google and `hiredStudents` to 0

## Cohort

Create a `Cohort` class that has the following

- fields:
    - `name`: the name of the cohort
    - `students`: a list of `Student`s
    - `mentors`: a list of `Mentor`s
- methods:
    - `addStudent(Student)`: adds the given `Student` to `students` list
    - `addMentor(Mentor)`: adds the given `Mentor` to `mentors` list
    - `info()`: prints "The `name` cohort has `students.size()` students and
      `mentors.size()` mentors."

The `Cohort` class has the following constructors:

- `Cohort(name)`: beside the given parameter it sets `students` and `mentors`
  to empty lists
