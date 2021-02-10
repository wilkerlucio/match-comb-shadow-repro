(ns sample.some-test
  (:require [clojure.test :refer [deftest is are run-tests testing]]
            [matcher-combinators.test]
            [matcher-combinators.matchers :as m]))

(deftest sample-test
  (is (match? (m/embeds {:foo "bar"}) {})))
