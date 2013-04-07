OpenID Lift Module
==================

This module provides integration with OpenID.

To include this module in your Lift project, update your `libraryDependencies` in `build.sbt` to include:

*Lift 2.5.x* for Scala 2.9 and 2.10:

    "net.liftmodules" %% "openid_2.5" % "1.2"

*Lift 3.0.x* for Scala 2.10:

    "net.liftmodules" %% "openid_3.0" % "1.2-SNAPSHOT"

Documentation
=============

**Note:** The module package changed from `net.liftweb.openid` to `net.liftmodules.openid` in May 2012.  Please consider this when referencing documentation written before that date.

_Exploring Lift_, chapter 13 discusses [OpenID integration](http://exploring.liftweb.net/master/index-13.html).


Notes for module developers
===========================

* The [Jenkins build](https://liftmodules.ci.cloudbees.com/job/openid/) is triggered on a push to master.



