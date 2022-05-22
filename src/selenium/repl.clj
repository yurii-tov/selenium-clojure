(ns selenium.repl
  (:require [selenium.core :refer :all]
            [selenium.elements :refer :all]
            [clojure.repl :refer [dir doc source apropos pst]]
            [clojure.java.io :as io]
            [clojure.string :as cstr]))
