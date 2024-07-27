---
- name: Update web servers
  hosts: webservers
  remote_user: root

  tasks:
  - name: Ensure apache is at the latest version
    ansible.builtin.yum:
      name: httpd
      state: latest
Playbook syntax

Playbook execution

Task execution

Desired state and ‘idempotency’

Running playbooks

Running playbooks in check mode

Ansible-Pull

Verifying playbooks

ansible-lint

  - name: Write the apache config file
  
    ansible.builtin.template:
      src: /srv/httpd.j2
      dest: /etc/httpd.conf

- name: Update db servers
  hosts: databases
  remote_user: root
Feature201
  Dillip kumar,rakesh
  sudarshan
Development
