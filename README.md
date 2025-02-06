# platform-test-ui-journey-tests-template.g8

Giter8 template for UI tests at HMRC.

Service teams should  **NOT** use this template. Please instead use the 'Create a repository' page via the MDTP Catalogue.

## Development
To contribute to the platform-test-ui-journey-tests-template.g8 you'll need to test your changes locally before raising a PR (see below).

### Generating a UI Test project from you local changes
To create a test project from your local changes, execute the following command from the parent directory of your local copy of the template:

    sbt new file://platform-test-ui-journey-tests-template.g8 --name=my-test-project

This will create a new UI test project in a folder named `my-test-project/`.

### Running the platform-test-ui-journey-tests-template.g8 tests
A shell script is available to generate a repository from the template and ensure it compiles. Steps to run this script are documented here:
[./test-platform-test-ui-journey-tests-template.sh](test-platform-test-ui-journey-tests-template.sh)

**Note:** The script does not include any assertions as the test repository contains no tests.

### Scalafmt
The generated template has already been formatted using scalafmt as well as containing a `.scalafmt.conf` configuration and sbt scalafmt plugin ready for teams to use.

Currently, formatting the files to include in a generated project is a manual task. This involves generating a new template from this project, formatting the generated files and then updating this repository to reflect the new formatting.

## Usage

Generate a new UI test repository from the template as follows:

* Argument <name> must be desired repository name.

```bash
sbt new file://platform-test-ui-journey-tests-template.g8 --name=<name>-ui-tests
```

## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
