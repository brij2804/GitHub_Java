This project contains the  prometheus and grafana integration.


starting prometheus :

C:\Program Files\prometheus-2.14.0.windows-amd64>prometheus --config.file=prometheus.yml

----------------------------prometheus.yml sample--------------------------


global:
  scrape_interval:     15s # By default, scrape targets every 15 seconds.

  # Attach these labels to any time series or alerts when communicating with
  # external systems (federation, remote storage, Alertmanager).
  external_labels:
    monitor: 'codelab-monitor'

# A scrape configuration containing exactly one endpoint to scrape:
# Here it's Prometheus itself.
scrape_configs:
  # The job name is added as a label `job=<job_name>` to any timeseries scraped from this config.
  - job_name: 'prometheus'

    # Override the global default and scrape targets from this job every 5 seconds.
    scrape_interval: 5s

    static_configs:
      - targets: ['localhost:9090']

  - job_name: 'spring-actuator'

    metrics_path: '/actuator/prometheus'

    scrape_interval: 5s

    static_configs:
      - targets: ['localhost:8080','localhost:8081','localhost:8888','localhost:8000','localhost:8001','localhost:8100','localhost:8761','localhost:8765']

-----------------------------

 # The job name is added as a label `job=<job_name>` to any timeseries scraped from this config.
  - job_name: 'prometheus'

    # Override the global default and scrape targets from this job every 5 seconds.
    scrape_interval: 5s

    static_configs:
      - targets: ['localhost:9090']

----------------------------------------------adding Grafana to Prometheus----------------------------------------------

https://prometheus.io/docs/visualization/grafana/

-------------------------------------------------------------------------

expression :

http_requests_total{code!~"2.."}

rate(http_requests_total[5m])

