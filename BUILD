load("@com_github_ash2k_bazel_tools//multirun:def.bzl", "multirun", "command")



multirun(
    name = "run_all",
    commands = [
        "//projects/java:springboot-app",
        "//projects/Node:node-app",
    ],
)

multirun(
    name = "run_all_parallel",
     commands = [
        "//projects/java:springboot-app",
        "//projects/Node:node-app",
    ],
    jobs = 0,
)