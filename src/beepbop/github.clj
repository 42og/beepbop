(ns beepbop.github
  "Github interaction namespace"
  (:require [tentacles.orgs :as org]
            [clojure.tools.logging :as log]))

(defn ^:private is-already-present? [name]
  "Simple predicate to check if user is
   already added to the group"
  {:pre [string? name]}
  (let [members (org/members "42og")
        active (select-keys members [:login])]
    (log/debug active)))

(defn invite-user [name]
  "Invite user to the group"
  {:pre [string? name]}
  (let [org "42og"]
  (when-not (org/member? org name {:oauth-token nil})
    (log/info (format "Inviting: \"%s\"" name)))))