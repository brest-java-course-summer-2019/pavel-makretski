[![Build Status](https://travis-ci.org/brest-java-course-summer-2019/pavel-makretski.svg?branch=master)](https://travis-ci.org/brest-java-course-summer-2019/pavel-makretski)
[![Coverage Status](https://coveralls.io/repos/github/brest-java-course-summer-2019/pavel-makretski/badge.svg?branch=master)](https://coveralls.io/github/brest-java-course-summer-2019/pavel-makretski?branch=master)

# Mak CRM Application

Demo project for Customer Relationship Management with two entities: “Sales Phase" (Digital Sales Funnel) and “Deals” (Leeds), related as one-to-many.

---

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

#### Prerequisites

```
git
jdk 11
maven 3+
```

#### Installing & Building project

```
git clone https://github.com/brest-java-course-summer-2019/pavel-makretski.git
cd /pavel-makretski/crm-project/
mvn clean install
```

#### Running tests

```
mvn clean test
```

#### Preparing reports

```
mvn site
cd crm-project/target/site/index.html
```

---

## Deploying on server

TODO: add deploying instruction and server tests

---
> Made with love by Pavel Makretski on Brest Epam Java Summer Course 2019 


