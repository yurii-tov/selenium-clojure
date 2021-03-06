# selenium-clojure

## What is it?
Wrapper for Selenium Webdriver (Java), written in Clojure

## Quickstart

### What you will need
1. Clojure (of course:))
2. Leiningen or Clojure CLI
3. Browser (Chrome, for example)
4. Appropriate web driver (for example, [Chromedriver](https://chromedriver.chromium.org/), installed and configured)

### Start browser and point it to some Wikipedia page
`$ cd selenium`

`$ lein repl`

```clojure
;; start-driver is a main entry point. It has a lot of options, see (doc start-driver)
selenium.core> (start-driver {:browser :chrome ; also available :firefox and :phantomjs
                              :headless? true
                              :url "https://wikipedia.org/wiki/Special:Random"})
```
### Inspect links on a page
```clojure
;; Two basic commands for that: find-element and find-elements
selenium.core> (def links (find-elements (css "a")))
selenium.core> (map element-text links)
```

### Quit driver, close browser
```clojure
selenium.core> (quit-driver)
```
