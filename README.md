# brackets-validator
[![Language](http://img.shields.io/badge/language-java-brightgreen.svg)](https://www.java.com/)
[![License](http://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/samtools/PolinaBevad/bio_relatives)

Test task. A program that validates brackets in the input sequence.

## Table of Contents
-   [Used technologies](#used-technologies)
-   [Notes](#notes)
-   [Tests](#tests)
-   [Maintainer](#maintainer)
-   [License](#license)

## Used technologies
-   Java 11
-   Maven
-   JUnit

## Notes
It is taken into account that the sequence can consist not only of brackets. The main thing is that the brackets are placed correctly.
For example, `{[()]}`, `((1 + 2) * 3) / 24` are correct, but `}{hello}`, `{()]}` are not correct.

## Tests
You can run Unit tests located in the directory: `src/test/java/ru/marchenko/brackets/validator`.

For example, you can use [Intellij IDEA](https://www.jetbrains.com/ru-ru/idea/download/#section=windows).

## Maintainer
Vladislav Marchenko

## License
This project is licenced under the terms of the [MIT](LICENSE) license.
