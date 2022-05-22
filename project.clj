(defproject com.github.yurii-tov/selenium "0.1.0-SNAPSHOT"
  :description "Selenium Webdriver wrapper"
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.seleniumhq.selenium/selenium-java "3.141.59"]
                 [com.github.detro/ghostdriver "2.1.0"]]
  :repl-options {:init-ns selenium.core})
