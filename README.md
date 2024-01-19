# platform-test-ui-journey-tests-template.g8

Giter8 template for UI journey tests at HMRC.

Service teams should **NOT** use this template. Please use the [create-a-test-repository](https://build.tax.service.gov.uk/job/PlatOps/job/Tools/job/create-a-test-repository/) build job instead.

## Usage

Generate a new UI journey test repository from the template as follows:

* Argument <name> must be desired repository name.

```bash
sbt new file://platform-test-ui-journey-tests-template.g8 --name=<name>-ui-journey-tests
```

## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
