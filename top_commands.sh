# List of commands you use most often
# @author linux_china

history | awk '{a[$2]++}END{for(i in a){print a[i] " " i}}' | sort -rn | head
