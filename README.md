This repository contains recipes for configuring a yocto image that already contains k3s. With the recipes, the k3s agent will automatically connect to the desired rancher server.

Recipes include:

* `k3s-agent-service`:  A systemd service to run k3s-agent at startup
* `k3s-config` A recipe to preconfigure the k3s-agent with a rancher server address and token at build time

Modify `recipes-k3s/k3s-config/files/config.yaml` to configure the k3s agent with the correct token and rancher server. Additional config options can also be included there.
